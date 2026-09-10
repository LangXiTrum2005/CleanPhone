package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20369a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f20369a) {
            case 0:
                b bVar = CrashlyticsController.r;
                return str.startsWith(".ae");
            default:
                return str.startsWith("aqs.");
        }
    }
}
