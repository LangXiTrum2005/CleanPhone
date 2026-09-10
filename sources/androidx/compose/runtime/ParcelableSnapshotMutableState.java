package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/decarock;", "Landroid/os/Parcelable;", "value", "Landroidx/compose/runtime/tailoring;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/tailoring;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "polloi", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParcelableSnapshotMutableState<T> extends MutableState<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new attabal();

    /* JADX INFO: compiled from: SnapshotState.android.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$attabal", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "saneness", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "attabal", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "size", "", "dern", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object>[] newArray(int size) {
            return new ParcelableSnapshotMutableState[size];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader loader) {
            tailoring tailoringVarMarial;
            if (loader == null) {
                loader = attabal.class.getClassLoader();
            }
            Object value = parcel.readValue(loader);
            int i = parcel.readInt();
            if (i == 0) {
                tailoringVarMarial = liable.marial();
            } else if (i == 1) {
                tailoringVarMarial = liable.competently();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
                }
                tailoringVarMarial = liable.beachfront();
            }
            return new ParcelableSnapshotMutableState<>(value, tailoringVarMarial);
        }
    }

    public ParcelableSnapshotMutableState(T t, tailoring<T> tailoringVar) {
        super(t, tailoringVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        parcel.writeValue(getValue());
        tailoring<T> tailoringVarAttabal = attabal();
        if (Intrinsics.wireman(tailoringVarAttabal, liable.marial())) {
            i = 0;
        } else if (Intrinsics.wireman(tailoringVarAttabal, liable.competently())) {
            i = 1;
        } else {
            if (!Intrinsics.wireman(tailoringVarAttabal, liable.beachfront())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i = 2;
        }
        parcel.writeInt(i);
    }
}
