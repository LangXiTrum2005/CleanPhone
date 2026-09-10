package b0;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f5193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f5194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f5197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f5198g;

    public q0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, HashSet hashSet) {
        this.f5192a = str;
        this.f5193b = charSequence;
        this.f5194c = charSequenceArr;
        this.f5195d = z10;
        this.f5196e = i10;
        this.f5197f = bundle;
        this.f5198g = hashSet;
        if (i10 == 2 && !z10) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
