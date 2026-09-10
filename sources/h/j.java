package h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new f9.d(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f42069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f42070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42072d;

    public j(IntentSender intentSender, Intent intent, int i10, int i11) {
        n.f(intentSender, "intentSender");
        this.f42069a = intentSender;
        this.f42070b = intent;
        this.f42071c = i10;
        this.f42072d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.f(dest, "dest");
        dest.writeParcelable(this.f42069a, i10);
        dest.writeParcelable(this.f42070b, i10);
        dest.writeInt(this.f42071c);
        dest.writeInt(this.f42072d);
    }
}
