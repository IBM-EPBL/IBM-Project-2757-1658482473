import numpy as np
import pandas as pd
import seaborn as sns
from pytz import timezone
from datetime import datetime
import tensorflow as tf


df = pd.read_csv('Salary.csv')
arr = np.array([[-2, 6, 1, 9],
                [8, -0.6, 7, 1],
                [3.7, 1, 3.6, 9],
                [7, -8, 5, 2.1]])
print("Initial Array: ")
print(arr)

sns.pairplot(df,hue="third",height=3)


format = "%Y-%m-%d %H:%M:%S %Z%z"

now_utc = datetime.now(timezone('UTC'))
print(now_utc.strftime(format))

now_asia = now_utc.astimezone(timezone('Asia/Kolkata'))
print(now_asia.strftime(format))

mnist = tf.keras.datasets.mnist
(x_train, y_train), (x_test, y_test) = mnist.load_data()
x_train, x_test = x_train / 255.0, x_test / 255.0
model = tf.keras.models.Sequential([
  tf.keras.layers.Flatten(input_shape=(28, 28)),
  tf.keras.layers.Dense(128, activation='relu'),
  tf.keras.layers.Dropout(0.2),
  tf.keras.layers.Dense(10)
])