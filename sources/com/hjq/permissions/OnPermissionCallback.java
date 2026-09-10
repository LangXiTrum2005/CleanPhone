package com.hjq.permissions;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface OnPermissionCallback {
    void onDenied(@NonNull List<String> list, boolean z);

    void onGranted(@NonNull List<String> list, boolean z);
}
