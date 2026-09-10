package androidx.p000activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u001b!B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kowloon", "Landroid/content/IntentSender;", "wireman", "()Landroid/content/IntentSender;", "arytenoidectomy", "Landroid/content/Intent;", "attabal", "()Landroid/content/Intent;", "monoploid", "I", "saneness", "polloi", "dern", "molybdenite", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Intent fillInIntent;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final IntentSender intentSender;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final int flagsMask;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int flagsValues;
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new saneness();

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$attabal;", "", "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "(Landroid/app/PendingIntent;)V", "Landroid/content/Intent;", "fillInIntent", "saneness", "(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$attabal;", "", "values", "mask", "dern", "(II)Landroidx/activity/result/IntentSenderRequest$attabal;", "Landroidx/activity/result/IntentSenderRequest;", "attabal", "()Landroidx/activity/result/IntentSenderRequest;", "Landroid/content/IntentSender;", "Landroid/content/Intent;", "I", "flagsMask", "wireman", "flagsValues", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final IntentSender intentSender;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public int flagsMask;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public Intent fillInIntent;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public int flagsValues;

        public attabal(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        public final IntentSenderRequest attabal() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        public final attabal dern(int values, int mask) {
            this.flagsValues = values;
            this.flagsMask = mask;
            return this;
        }

        public final attabal saneness(Intent fillInIntent) {
            this.fillInIntent = fillInIntent;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public attabal(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/activity/result/IntentSenderRequest$saneness", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcel;", "inParcel", "attabal", "(Landroid/os/Parcel;)Landroidx/activity/result/IntentSenderRequest;", "", "size", "", "saneness", "(I)[Landroidx/activity/result/IntentSenderRequest;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int size) {
            return new IntentSenderRequest[size];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getFlagsValues() {
        return this.flagsValues;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getFlagsMask() {
        return this.flagsMask;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.beachfront(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
