
package com.example.MyCardVisit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycardvisit.ui.theme.MyCardVisitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCardVisitTheme(){
                CardView()
            }
        }
    }
}

@Composable
fun CardView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Lumena Ouattara", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Conception Merise", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "+2250749996971", fontSize = 16.sp)
        Text(text = "+2250103654627", fontSize = 16.sp)
        Text(text = "asita16@univmetiers.ci", fontSize = 16.sp)
        Text(text = "ouattaraasita06@gmail.com", fontSize = 13.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCardVisitTheme{
        CardView()
    }
}