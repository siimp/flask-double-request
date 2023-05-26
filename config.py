def pre_request(worker, req):
    worker.log.info("pre: %s %s %s" % (req.method, req.path, req.headers))

def post_request(worker, req, environ, resp):
    worker.log.info("post: %s %s %s" % (req.method, req.path, req.headers))