
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

fun ViewModel.launchDispatcherMain(operation: suspend CoroutineScope.() -> Unit): Job {


    return viewModelScope.launch(Dispatchers.Main, CoroutineStart.DEFAULT, operation)

}

fun FragmentActivity.launchDispatcherMain(operation: suspend CoroutineScope.() -> Unit): Job {


    return lifecycleScope.launch(Dispatchers.Main, CoroutineStart.DEFAULT, operation)

}

fun Fragment.launchDispatcherMain(operation: suspend CoroutineScope.() -> Unit): Job {


    return lifecycleScope.launch(Dispatchers.Main, CoroutineStart.DEFAULT, operation)

}

fun ViewModel.launchDispatcherIO(operation: suspend CoroutineScope.() -> Unit): Job {


    return viewModelScope.launch(Dispatchers.IO, CoroutineStart.DEFAULT, operation)

}

fun FragmentActivity.launchDispatcherIO(operation: suspend CoroutineScope.() -> Unit): Job {


    return lifecycleScope.launch(Dispatchers.IO, CoroutineStart.DEFAULT, operation)

}

fun Fragment.launchDispatcherIO(operation: suspend CoroutineScope.() -> Unit): Job {


    return lifecycleScope.launch(Dispatchers.IO, CoroutineStart.DEFAULT, operation)

}
