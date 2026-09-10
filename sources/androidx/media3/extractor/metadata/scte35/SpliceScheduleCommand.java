package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new AnonymousClass1();
    public final List X;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }
    }

    public static final class ComponentSplice {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6955b;

        public ComponentSplice(int i2, long j) {
            this.f6954a = i2;
            this.f6955b = j;
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new Event(parcel));
        }
        this.X = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.X;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Event event = (Event) list.get(i3);
            parcel.writeLong(event.f6956a);
            parcel.writeByte(event.f6957b ? (byte) 1 : (byte) 0);
            parcel.writeByte(event.f6958c ? (byte) 1 : (byte) 0);
            parcel.writeByte(event.d ? (byte) 1 : (byte) 0);
            List list2 = event.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                ComponentSplice componentSplice = (ComponentSplice) list2.get(i4);
                parcel.writeInt(componentSplice.f6954a);
                parcel.writeLong(componentSplice.f6955b);
            }
            parcel.writeLong(event.f6959e);
            parcel.writeByte(event.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(event.f6960h);
            parcel.writeInt(event.f6961i);
            parcel.writeInt(event.j);
            parcel.writeInt(event.k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.X = Collections.unmodifiableList(arrayList);
    }

    public static final class Event {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6958c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6959e;
        public final List f;
        public final boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f6960h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6961i;
        public final int j;
        public final int k;

        public Event(long j, boolean z2, boolean z3, boolean z4, ArrayList arrayList, long j2, boolean z5, long j3, int i2, int i3, int i4) {
            this.f6956a = j;
            this.f6957b = z2;
            this.f6958c = z3;
            this.d = z4;
            this.f = Collections.unmodifiableList(arrayList);
            this.f6959e = j2;
            this.g = z5;
            this.f6960h = j3;
            this.f6961i = i2;
            this.j = i3;
            this.k = i4;
        }

        public Event(Parcel parcel) {
            this.f6956a = parcel.readLong();
            this.f6957b = parcel.readByte() == 1;
            this.f6958c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new ComponentSplice(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f6959e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.f6960h = parcel.readLong();
            this.f6961i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}
