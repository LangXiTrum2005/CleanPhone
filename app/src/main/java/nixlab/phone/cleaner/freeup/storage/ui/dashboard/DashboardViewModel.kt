package nixlab.phone.cleaner.freeup.storage.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import nixlab.phone.cleaner.freeup.storage.data.model.ScanResult
import nixlab.phone.cleaner.freeup.storage.data.repository.StorageScannerRepository
import nixlab.phone.cleaner.freeup.storage.util.FileUtils
import nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager
import nixlab.phone.cleaner.freeup.storage.util.PermissionUtils
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class DashboardViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = StorageScannerRepository(application)
    private var scanJob: Job? = null

    sealed class UiState {
        object Idle : UiState()
        data class Scanning(val progress: Int, val message: String) : UiState()
        data class Success(val result: ScanResult) : UiState()
        data class Error(val message: String) : UiState()
    }

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private val _storageStats = MutableStateFlow(FileUtils.getDeviceStorageStats())
    val storageStats: StateFlow<FileUtils.StorageStats> = _storageStats.asStateFlow()

    init {
        // Real-time synchronization when user takes new photos/videos or modifies gallery
        viewModelScope.launch {
            MediaStoreSyncManager.mediaUpdateFlow.collectLatest {
                if (PermissionUtils.hasMediaPermissions(getApplication())) {
                    startScan()
                }
            }
        }
    }

    fun refreshStorageStats() {
        _storageStats.value = FileUtils.getDeviceStorageStats()
    }

    fun startScan() {
        scanJob?.cancel()
        scanJob = viewModelScope.launch {
            refreshStorageStats()
            repository.scanStorage().collect { progress ->
                when (progress) {
                    is StorageScannerRepository.ScanProgress.Progress -> {
                        _uiState.value = UiState.Scanning(progress.percent, progress.message)
                    }
                    is StorageScannerRepository.ScanProgress.Completed -> {
                        _uiState.value = UiState.Success(progress.result)
                        refreshStorageStats()
                    }
                    is StorageScannerRepository.ScanProgress.Error -> {
                        _uiState.value = UiState.Error(progress.error)
                    }
                }
            }
        }
    }
}
