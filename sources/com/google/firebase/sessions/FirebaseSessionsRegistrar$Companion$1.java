package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import java.util.List;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class FirebaseSessionsRegistrar$Companion$1 extends FunctionReferenceImpl implements tetrahedral.kowloon<String, libyan.saneness<androidx.datastore.preferences.core.dern>, Function1<? super Context, ? extends List<? extends androidx.datastore.core.beachfront<androidx.datastore.preferences.core.dern>>>, saran, bren.dern<? super Context, ? extends androidx.datastore.core.competently<androidx.datastore.preferences.core.dern>>> {
    public static final FirebaseSessionsRegistrar$Companion$1 INSTANCE = new FirebaseSessionsRegistrar$Companion$1();

    public FirebaseSessionsRegistrar$Companion$1() {
        super(4, PreferenceDataStoreDelegateKt.class, "preferencesDataStore", "preferencesDataStore(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", 1);
    }

    public final bren.dern<Context, androidx.datastore.core.competently<androidx.datastore.preferences.core.dern>> invoke(String p0, libyan.saneness<androidx.datastore.preferences.core.dern> sanenessVar, Function1<? super Context, ? extends List<? extends androidx.datastore.core.beachfront<androidx.datastore.preferences.core.dern>>> p2, saran p3) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        return PreferenceDataStoreDelegateKt.attabal(p0, sanenessVar, p2, p3);
    }
}
