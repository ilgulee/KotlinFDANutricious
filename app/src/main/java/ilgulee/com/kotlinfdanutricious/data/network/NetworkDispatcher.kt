package ilgulee.com.kotlinfdanutricious.data.network

import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

val NETWORK = Executors.newFixedThreadPool(2).asCoroutineDispatcher() // Dedicated network context