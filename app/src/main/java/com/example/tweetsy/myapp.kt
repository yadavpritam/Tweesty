import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tweetsy.viewmodels.CategoryViewModel
import java.nio.file.WatchEvent

//package com.example.tweetsy
//
//import androidx.compose.foundation.clickable
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navArgument
//import com.example.tweetsy.ui.theme.TweetsyTheme
//
//
//@Preview(showBackground = true)
//@Composable
//private fun MyApp() {
//    val navController= rememberNavController()
//    TweetsyTheme {
//        NavHost(navController=navController, startDestination = "login"){
//            composable("registration"){
//                RegsitrationScreen()
//            }
//            composable("login"){
//                LoginScreen{
//                    navController.navigate(route="main/{$it}")
//                }
//            }
//            composable("main/{email}", arguments = listOf(
//                navArgument("email") {
//                    type= NavType.StringType
//                }
//            )){
//                val email= it.arguments?.getString("email")
//                MainScreen(email!!)
//            }
//        }
//    }
//
//
//}
//
//@Composable
//fun RegsitrationScreen() {
//        Text(
//            "Welcome to Registration Screen",
//            style = MaterialTheme.typography.headlineMedium,
//        )
//}
//@Composable
//fun LoginScreen(onClick:(email: String)-> Unit) {
//    Text(
//        "Welcome to Login Screen",
//        style = MaterialTheme.typography.headlineMedium,
//        modifier = Modifier.clickable{
//            onClick("william.henry.harrison@example-pet-store.com")
//
//        }
//    )
//}
//@Composable
//fun MainScreen(email: String) {
//    Text(
//        text = email,
//        style = MaterialTheme.typography.headlineMedium,
//    )
//}










