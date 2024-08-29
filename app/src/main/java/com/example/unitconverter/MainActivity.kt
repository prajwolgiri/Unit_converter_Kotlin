package com.example.unitconverter


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Prajwol")  //here what is called that function is printed in the UI
                    UnitConverter()         // Unit converter function is called which is the Composable that is printed in the UI
                    

                }
            }
        }
    }
}

@Composable
fun UnitConverter(){

    var inputValue by remember{ mutableStateOf("")}


//    val context = LocalContext.current
    // column down below prints in the column state in the ui


    // here we use simple code for styling in UI like in css do if suppose purai column lai garna man cha bhaney column ko xeu ma () bracket bhitra lekhney
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        // this is printed in the ui in the column space
        
        Text("Unit Converter", Modifier.padding(16.dp))  // example of using padding for modifying the UI





        OutlinedTextField(value =inputValue  , onValueChange ={//
            inputValue=it
        // here it specifies what should happen when the value of the OutlinedTextField changes//
        }, label = { Text(text = "Enter the value")}

        )



        Spacer(modifier = Modifier.height(16.dp)) // example of Spacer for UI

        // row down below prints in the row state in the ui
        Row {
            // this is printed in the ui in the row space to stack it

            // Button is used to display the button which contains value when clicking inside button the statement is written in the { }
            // toast is used to display the text in current time after clicking click me
            // context describes the current context that is clicking the click me

//            Button(onClick = { Toast.makeText(context,"Thanks for clicking",Toast.LENGTH_LONG).show() })
//            {
//                Text("Click me")
//            }




            Box{
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,contentDescription="Arrow down ")

                    
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {

                    DropdownMenuItem(text = { Text("centimeter") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("inch") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("millimeter") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("feet") }, onClick = { /*TODO*/ })


                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box{
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,contentDescription="Arrow down ")


                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {

                    DropdownMenuItem(text = { Text("centimeter") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("inch") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("millimeter") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("feet") }, onClick = { /*TODO*/ })


                }
            }


        }
    }




}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}



@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}