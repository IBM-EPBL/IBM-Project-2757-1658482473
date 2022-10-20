from flask import *;
import os

app = Flask(__name__)


@app.route('/', methods=['GET', 'POST'])
def home():
    if request.method == 'POST':
        name = request.form["name"]
        email= request.form["email"]
        mobile = request.form["mobile"]
        return redirect(url_for('result', name=name, email=email, mobile=mobile))
    return render_template('index.html')


@app.route("/result", methods=['GET', 'POST'])
def result():
    name = request.form.get('name')
    email= request.form.get('email')
    mobile = request.form.get('mobile')
    return render_template('result.html', name=name, email=email, mobile=mobile)

if __name__ == "__main__":
    app.run(debug=True, port=3000
