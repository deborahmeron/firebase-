package net.simplifiedcoding.ui.services

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import net.simplifiedcoding.R
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun ServicesScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Text(
        text = stringResource(id = R.string.services),
    )


}