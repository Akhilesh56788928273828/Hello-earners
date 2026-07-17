package com.heppiearn.app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    var balance by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Heppi Earn", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(32.dp))
        
        Text("Balance: ₹$balance", style = MaterialTheme.typography.headlineMedium)
        
        Spacer(modifier = Modifier.height(48.dp))
        
        Button(onClick = { balance += 5 }) {
            Text("Watch Ad & Earn ₹5")
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = { /* Captcha logic */ }) {
            Text("Daily Check-in")
        }
    }
}
