package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/IntentSenderRequest$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest$Companion$CREATOR$1 implements Parcelable.Creator<IntentSenderRequest> {
    @Override // android.os.Parcelable.Creator
    public final IntentSenderRequest createFromParcel(Parcel inParcel) {
        Intrinsics.f(inParcel, "inParcel");
        Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.c(parcelable);
        return new IntentSenderRequest((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final IntentSenderRequest[] newArray(int i2) {
        return new IntentSenderRequest[i2];
    }
}
