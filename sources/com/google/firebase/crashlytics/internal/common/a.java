package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int X;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((CrashlyticsReport.CustomAttribute) obj).b().compareTo(((CrashlyticsReport.CustomAttribute) obj2).b());
        }
    }
}
