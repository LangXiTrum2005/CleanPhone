package androidx.recyclerview.widget;

import com.google.android.gms.internal.ads.u02;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4956d = 0;

    public r1.g a() {
        if (this.f4953a || !(this.f4954b || this.f4955c)) {
            return new r1.g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public u02 b() {
        if (this.f4953a || !(this.f4954b || this.f4955c)) {
            return new u02(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
