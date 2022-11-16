from flask import Flask, render_template, request, redirect, url_for, session

app = Flask(__name__)
  
@app.route("/")
def hello():
    return "Hello World! Welcome to this page"
    
if __name__ == '__main__':
   app.run(debug=True, port=5000)
