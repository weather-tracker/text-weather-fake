/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme() {
                Surface() {
                    Column(modifier = Modifier.padding(16.dp)) {
                        MyApp()
                        myButton1()
                        Text(text = "")
                        Text(text = "hourly")
                        hourly()
                        Text(text = "")
                        myButton2()
                        Text(text = "")
                        Text(text = "daily")
                        daily()

                    }
                }
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {

        Column() {
            Text(text = "Welcome to text weather!")
            Text(text = "Here is the weather for your location")
            Text(text = "current weather is ")
            Text(text = "")
            weather()
            Text(text = "")
        }

 }

@Composable
fun myButton1() {


    Button(onClick = {/*Handle click action */ },) {
        Text(

            text = "Hourly Weather"
        )
    }
}
@Composable
fun myButton2() {
    Button(onClick = {/*Handle click action */ }, ) {
        Text(

            text = "Daily"
        )
    }
}



@Composable
fun weather() {
        Column(){
        Text(text = "50F wind NE at 10 mph. dew point is 40F")
                }
            }

var h1 = "1. 50F wind NE at 10 mph. dew point is 40F."
var h2 = "2. 51F Wind N at 5 mph. dew point is 42F."
var h3 = "3. 54F Wind N at 3 mph. dew point is 44F."
var h4 = "4. 55F Wind N at 1 mph. dew point is 46F."

@Composable
fun hourly() {
        Column{
            Text(text = "$h1")
            Text(text = "$h2")
            Text(text = "$h3")
            Text(text = "$h4")
        }
}

var d1 = "day 1. high of 55 low of 40"
var d2 = "day 2. high of 54 low of 42"
var d3 = "day 3. high of 60 low of 45"
var d4 = "day 4. high of 50 low of 35"

@Composable
fun daily() {
    Column() {
               Text(text = "$d1")
               Text(text = "$d2")
               Text(text = "$d3")
               Text(text = "$d4")
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme() {
        Surface() {
            Column(modifier = Modifier.padding(16.dp)) {
                MyApp()
                myButton1()
                Text(text = "")
                Text(text = "hourly")
                hourly()
                Text(text = "")
                myButton2()
                Text(text = "")
                Text(text = "daily")
                daily()

            }
        }
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme() {
        Surface() {
            Column(modifier = Modifier.padding(16.dp)) {
                MyApp()
                myButton1()
                Text(text = "")
                Text(text = "hourly")
                hourly()
                Text(text = "")
                myButton2()
                Text(text = "")
                Text(text = "daily")
                daily()

            }
        }
    }
}
