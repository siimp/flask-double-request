import logging
from flask import Flask
import time

logging.basicConfig(level=logging.INFO)
app = Flask(__name__)

@app.route("/")
def hello_world():
    app.logger.info('starting hello_world')
    time.sleep(10)
    app.logger.info('ending hello_world')
    return "Hello world after 10 seconds"