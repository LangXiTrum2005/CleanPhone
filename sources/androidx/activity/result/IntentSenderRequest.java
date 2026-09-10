package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Builder", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new IntentSenderRequest$Companion$CREATOR$1();
    public final IntentSender X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Intent f3264Y;
    public final int Z;
    public final int e0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "Flag", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentSender f3265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f3266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3267c;
        public int d;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            Intrinsics.f(intentSender, "intentSender");
            this.f3265a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f3265a, this.f3266b, this.f3267c, this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        Intrinsics.f(intentSender, "intentSender");
        this.X = intentSender;
        this.f3264Y = intent;
        this.Z = i2;
        this.e0 = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.f(dest, "dest");
        dest.writeParcelable(this.X, i2);
        dest.writeParcelable(this.f3264Y, i2);
        dest.writeInt(this.Z);
        dest.writeInt(this.e0);
    }
}
