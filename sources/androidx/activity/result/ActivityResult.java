package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Intent f3248Y;

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityResult[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    }

    public ActivityResult(int i2, Intent intent) {
        this.X = i2;
        this.f3248Y = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.X;
        if (i2 != -1) {
            strValueOf = i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f3248Y);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
        Intent intent = this.f3248Y;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.X = parcel.readInt();
        this.f3248Y = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
