# podman build --tag my-flask:latest .
# podman run -p 5000:5000 my-flask:latest
# curl http://localhost:5000

FROM python:3-alpine

RUN pip install Flask gunicorn==20.0.4

COPY hello.py hello.py
COPY config.py config.py

CMD gunicorn -t 3 -w 4 -b 0.0.0.0:5000 --log-level INFO --config config.py 'hello:app'