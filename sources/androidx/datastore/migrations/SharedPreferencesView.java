package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f4712b;

    public SharedPreferencesView(SharedPreferences prefs, LinkedHashSet linkedHashSet) {
        Intrinsics.f(prefs, "prefs");
        this.f4711a = prefs;
        this.f4712b = linkedHashSet;
    }
}
