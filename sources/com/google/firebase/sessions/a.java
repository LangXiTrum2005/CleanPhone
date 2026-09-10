package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Context f21143Y;

    public /* synthetic */ a(Context context, int i2) {
        this.X = i2;
        this.f21143Y = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        switch (this.X) {
            case 0:
                File fileA = DataStoreFile.a(this.f21143Y, "firebaseSessions/sessionConfigsDataStore.data");
                FirebaseSessionsComponent.MainModule.Companion.b(fileA);
                return fileA;
            default:
                File fileA2 = DataStoreFile.a(this.f21143Y, "firebaseSessions/sessionDataStore.data");
                FirebaseSessionsComponent.MainModule.Companion.b(fileA2);
                return fileA2;
        }
    }
}
