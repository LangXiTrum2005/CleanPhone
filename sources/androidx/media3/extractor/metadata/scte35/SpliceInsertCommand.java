package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f6950Y;
    public final boolean Z;
    public final boolean e0;
    public final boolean f0;
    public final long g0;
    public final long h0;
    public final List i0;
    public final boolean j0;
    public final long k0;
    public final int l0;
    public final int m0;
    public final int n0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }
    }

    public static final class ComponentSplice {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6953c;

        public ComponentSplice(int i2, long j, long j2) {
            this.f6951a = i2;
            this.f6952b = j;
            this.f6953c = j2;
        }
    }

    public SpliceInsertCommand(long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, List list, boolean z6, long j4, int i2, int i3, int i4) {
        this.X = j;
        this.f6950Y = z2;
        this.Z = z3;
        this.e0 = z4;
        this.f0 = z5;
        this.g0 = j2;
        this.h0 = j3;
        this.i0 = Collections.unmodifiableList(list);
        this.j0 = z6;
        this.k0 = j4;
        this.l0 = i2;
        this.m0 = i3;
        this.n0 = i4;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.g0);
        sb.append(", programSplicePlaybackPositionUs= ");
        return a.j(this.h0, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeByte(this.f6950Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g0);
        parcel.writeLong(this.h0);
        List list = this.i0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ComponentSplice componentSplice = (ComponentSplice) list.get(i3);
            parcel.writeInt(componentSplice.f6951a);
            parcel.writeLong(componentSplice.f6952b);
            parcel.writeLong(componentSplice.f6953c);
        }
        parcel.writeByte(this.j0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k0);
        parcel.writeInt(this.l0);
        parcel.writeInt(this.m0);
        parcel.writeInt(this.n0);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.X = parcel.readLong();
        this.f6950Y = parcel.readByte() == 1;
        this.Z = parcel.readByte() == 1;
        this.e0 = parcel.readByte() == 1;
        this.f0 = parcel.readByte() == 1;
        this.g0 = parcel.readLong();
        this.h0 = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.i0 = Collections.unmodifiableList(arrayList);
        this.j0 = parcel.readByte() == 1;
        this.k0 = parcel.readLong();
        this.l0 = parcel.readInt();
        this.m0 = parcel.readInt();
        this.n0 = parcel.readInt();
    }
}
