package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.c;
import androidx.fragment.app.c1;
import androidx.fragment.app.i1;
import androidx.fragment.app.m1;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.z;
import com.google.android.gms.auth.TokenData;
import defpackage.e;
import e.d;
import ea.i;
import ea.i4;
import ea.n4;
import ea.t;
import ea.t3;
import ea.u;
import ea.w3;
import ea.x3;
import ea.y3;
import java.util.ArrayList;
import qk.i0;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3808a;

    public /* synthetic */ a(int i10) {
        this.f3808a = i10;
    }

    public static void a(u uVar, Parcel parcel, int i10) {
        String str = uVar.f39771a;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 2, str);
        b.I(parcel, 3, uVar.f39772b, i10);
        b.J(parcel, 4, uVar.f39773c);
        long j10 = uVar.f39774d;
        b.Q(parcel, 5, 8);
        parcel.writeLong(j10);
        long j11 = uVar.f39775e;
        b.Q(parcel, 6, 8);
        parcel.writeLong(j11);
        b.S(parcel, iR);
    }

    public static void b(i4 i4Var, Parcel parcel) {
        int i10 = i4Var.f39484a;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(i10);
        b.J(parcel, 2, i4Var.f39485b);
        long j10 = i4Var.f39486c;
        b.Q(parcel, 3, 8);
        parcel.writeLong(j10);
        Long l = i4Var.f39487d;
        if (l != null) {
            b.Q(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        b.J(parcel, 6, i4Var.f39488e);
        b.J(parcel, 7, i4Var.f39489f);
        Double d10 = i4Var.f39490g;
        if (d10 != null) {
            b.Q(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        b.S(parcel, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        long jE0 = 0;
        int iD0 = 0;
        e.b bVar = null;
        ArrayList arrayListZ = null;
        ArrayList arrayListR = null;
        String strV = null;
        Bundle bundleN = null;
        Bundle bundleN2 = null;
        switch (this.f3808a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f3794a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f3795b;

                    {
                        this.f3794a = parcel.readInt();
                        this.f3795b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f3794a + ", mDescription=" + this.f3795b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeInt(this.f3794a);
                        this.f3795b.writeToParcel(parcel2, i10);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f3804i = mediaDescription;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.a(4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f3809a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f3810b;

                    {
                        this.f3809a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f3810b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f3809a);
                        sb2.append(", Id=");
                        return e.r(sb2, this.f3810b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f3809a.writeToParcel(parcel2, i10);
                        parcel2.writeLong(this.f3810b);
                    }
                };
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f3811a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new android.support.v4.media.a(6);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Object f3812a;

                    {
                        this.f3812a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f3812a;
                        Object obj3 = this.f3812a;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f3812a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeParcelable((Parcelable) this.f3812a, i10);
                    }
                };
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f3813a = parcel.readInt();
                parcelableVolumeInfo.f3815c = parcel.readInt();
                parcelableVolumeInfo.f3816d = parcel.readInt();
                parcelableVolumeInfo.f3817e = parcel.readInt();
                parcelableVolumeInfo.f3814b = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new androidx.fragment.app.b(parcel);
            case 10:
                return new c(parcel);
            case 11:
                c1 c1Var = new c1();
                c1Var.f4269a = parcel.readString();
                c1Var.f4270b = parcel.readInt();
                return c1Var;
            case 12:
                i1 i1Var = new i1();
                i1Var.f4361e = null;
                i1Var.f4362f = new ArrayList();
                i1Var.f4363g = new ArrayList();
                i1Var.f4357a = parcel.createStringArrayList();
                i1Var.f4358b = parcel.createStringArrayList();
                i1Var.f4359c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                i1Var.f4360d = parcel.readInt();
                i1Var.f4361e = parcel.readString();
                i1Var.f4362f = parcel.createStringArrayList();
                i1Var.f4363g = parcel.createTypedArrayList(c.CREATOR);
                i1Var.f4364h = parcel.createTypedArrayList(c1.CREATOR);
                return i1Var;
            case 13:
                return new m1(parcel);
            case 14:
                z zVar = new z();
                zVar.f4978a = parcel.readInt();
                zVar.f4979b = parcel.readInt();
                zVar.f4980c = parcel.readInt() == 1;
                return zVar;
            case 15:
                androidx.recyclerview.widget.m1 m1Var = new androidx.recyclerview.widget.m1();
                m1Var.f4825a = parcel.readInt();
                m1Var.f4826b = parcel.readInt();
                m1Var.f4828d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    m1Var.f4827c = iArr;
                    parcel.readIntArray(iArr);
                }
                return m1Var;
            case 16:
                n1 n1Var = new n1();
                n1Var.f4838a = parcel.readInt();
                n1Var.f4839b = parcel.readInt();
                int i11 = parcel.readInt();
                n1Var.f4840c = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    n1Var.f4841d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                n1Var.f4842e = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    n1Var.f4843f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n1Var.f4845h = parcel.readInt() == 1;
                n1Var.f4846i = parcel.readInt() == 1;
                n1Var.f4847j = parcel.readInt() == 1;
                n1Var.f4844g = parcel.readArrayList(androidx.recyclerview.widget.m1.class.getClassLoader());
                return n1Var;
            case 17:
                int iO0 = i0.o0(parcel);
                int iD1 = 0;
                boolean zA0 = false;
                boolean zA1 = false;
                String strV2 = null;
                Long lValueOf = null;
                ArrayList arrayListX = null;
                String strV3 = null;
                while (parcel.dataPosition() < iO0) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iD1 = i0.d0(parcel, i13);
                            break;
                        case 2:
                            strV2 = i0.v(parcel, i13);
                            break;
                        case 3:
                            int iF0 = i0.f0(parcel, i13);
                            if (iF0 != 0) {
                                i0.s0(parcel, iF0, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 4:
                            zA0 = i0.a0(parcel, i13);
                            break;
                        case 5:
                            zA1 = i0.a0(parcel, i13);
                            break;
                        case 6:
                            arrayListX = i0.x(parcel, i13);
                            break;
                        case 7:
                            strV3 = i0.v(parcel, i13);
                            break;
                        default:
                            i0.l0(parcel, i13);
                            break;
                    }
                }
                i0.D(parcel, iO0);
                return new TokenData(iD1, strV2, lValueOf, zA0, zA1, arrayListX, strV3);
            case 18:
                d dVar = new d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i14 = e.c.f38975b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e.b.f38974f9);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e.b)) {
                        e.a aVar = new e.a();
                        aVar.f38973a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (e.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f38977a = bVar;
                return dVar;
            case 19:
                int iO1 = i0.o0(parcel);
                long jE1 = 0;
                long jE2 = 0;
                int iD2 = 0;
                while (parcel.dataPosition() < iO1) {
                    int i15 = parcel.readInt();
                    char c4 = (char) i15;
                    if (c4 == 1) {
                        jE1 = i0.e0(parcel, i15);
                    } else if (c4 == 2) {
                        iD2 = i0.d0(parcel, i15);
                    } else if (c4 != 3) {
                        i0.l0(parcel, i15);
                    } else {
                        jE2 = i0.e0(parcel, i15);
                    }
                }
                i0.D(parcel, iO1);
                return new ea.d(jE1, iD2, jE2);
            case 20:
                int iO2 = i0.o0(parcel);
                long jE3 = 0;
                long jE4 = 0;
                long jE5 = 0;
                boolean zA2 = false;
                String strV4 = null;
                String strV5 = null;
                i4 i4Var = null;
                String strV6 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (parcel.dataPosition() < iO2) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strV4 = i0.v(parcel, i16);
                            break;
                        case 3:
                            strV5 = i0.v(parcel, i16);
                            break;
                        case 4:
                            i4Var = (i4) i0.s(parcel, i16, i4.CREATOR);
                            break;
                        case 5:
                            jE3 = i0.e0(parcel, i16);
                            break;
                        case 6:
                            zA2 = i0.a0(parcel, i16);
                            break;
                        case 7:
                            strV6 = i0.v(parcel, i16);
                            break;
                        case '\b':
                            uVar = (u) i0.s(parcel, i16, u.CREATOR);
                            break;
                        case '\t':
                            jE4 = i0.e0(parcel, i16);
                            break;
                        case '\n':
                            uVar2 = (u) i0.s(parcel, i16, u.CREATOR);
                            break;
                        case 11:
                            jE5 = i0.e0(parcel, i16);
                            break;
                        case '\f':
                            uVar3 = (u) i0.s(parcel, i16, u.CREATOR);
                            break;
                        default:
                            i0.l0(parcel, i16);
                            break;
                    }
                }
                i0.D(parcel, iO2);
                return new ea.e(strV4, strV5, i4Var, jE3, zA2, strV6, uVar, jE4, uVar2, jE5, uVar3);
            case 21:
                int iO3 = i0.o0(parcel);
                while (parcel.dataPosition() < iO3) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        i0.l0(parcel, i17);
                    } else {
                        bundleN2 = i0.n(parcel, i17);
                    }
                }
                i0.D(parcel, iO3);
                return new i(bundleN2);
            case 22:
                int iO4 = i0.o0(parcel);
                while (parcel.dataPosition() < iO4) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        i0.l0(parcel, i18);
                    } else {
                        bundleN = i0.n(parcel, i18);
                    }
                }
                i0.D(parcel, iO4);
                return new t(bundleN);
            case 23:
                int iO5 = i0.o0(parcel);
                long jE6 = 0;
                long jE7 = 0;
                String strV7 = null;
                t tVar = null;
                String strV8 = null;
                while (parcel.dataPosition() < iO5) {
                    int i19 = parcel.readInt();
                    char c5 = (char) i19;
                    if (c5 == 2) {
                        strV7 = i0.v(parcel, i19);
                    } else if (c5 == 3) {
                        tVar = (t) i0.s(parcel, i19, t.CREATOR);
                    } else if (c5 == 4) {
                        strV8 = i0.v(parcel, i19);
                    } else if (c5 == 5) {
                        jE6 = i0.e0(parcel, i19);
                    } else if (c5 != 6) {
                        i0.l0(parcel, i19);
                    } else {
                        jE7 = i0.e0(parcel, i19);
                    }
                }
                i0.D(parcel, iO5);
                return new u(strV7, tVar, strV8, jE6, jE7);
            case 24:
                int iO6 = i0.o0(parcel);
                while (parcel.dataPosition() < iO6) {
                    int i20 = parcel.readInt();
                    char c10 = (char) i20;
                    if (c10 == 1) {
                        strV = i0.v(parcel, i20);
                    } else if (c10 == 2) {
                        jE0 = i0.e0(parcel, i20);
                    } else if (c10 != 3) {
                        i0.l0(parcel, i20);
                    } else {
                        iD0 = i0.d0(parcel, i20);
                    }
                }
                i0.D(parcel, iO6);
                return new t3(iD0, jE0, strV);
            case 25:
                int iO7 = i0.o0(parcel);
                long jE8 = 0;
                long jE9 = 0;
                int iD3 = 0;
                byte[] bArrO = null;
                String strV9 = null;
                Bundle bundleN3 = null;
                String strV10 = null;
                while (parcel.dataPosition() < iO7) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            jE8 = i0.e0(parcel, i21);
                            break;
                        case 2:
                            bArrO = i0.o(parcel, i21);
                            break;
                        case 3:
                            strV9 = i0.v(parcel, i21);
                            break;
                        case 4:
                            bundleN3 = i0.n(parcel, i21);
                            break;
                        case 5:
                            iD3 = i0.d0(parcel, i21);
                            break;
                        case 6:
                            jE9 = i0.e0(parcel, i21);
                            break;
                        case 7:
                            strV10 = i0.v(parcel, i21);
                            break;
                        default:
                            i0.l0(parcel, i21);
                            break;
                    }
                }
                i0.D(parcel, iO7);
                return new w3(jE8, bArrO, strV9, bundleN3, iD3, jE9, strV10);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                int iO8 = i0.o0(parcel);
                while (parcel.dataPosition() < iO8) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        i0.l0(parcel, i22);
                    } else {
                        arrayListR = i0.r(parcel, i22);
                    }
                }
                i0.D(parcel, iO8);
                return new x3(arrayListR);
            case 27:
                int iO9 = i0.o0(parcel);
                while (parcel.dataPosition() < iO9) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        i0.l0(parcel, i23);
                    } else {
                        arrayListZ = i0.z(parcel, i23, w3.CREATOR);
                    }
                }
                i0.D(parcel, iO9);
                return new y3(arrayListZ);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                int iO10 = i0.o0(parcel);
                long jE10 = 0;
                int iD4 = 0;
                String strV11 = null;
                Long lValueOf2 = null;
                Float fValueOf = null;
                String strV12 = null;
                String strV13 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iO10) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iD4 = i0.d0(parcel, i24);
                            break;
                        case 2:
                            strV11 = i0.v(parcel, i24);
                            break;
                        case 3:
                            jE10 = i0.e0(parcel, i24);
                            break;
                        case 4:
                            int iF1 = i0.f0(parcel, i24);
                            if (iF1 != 0) {
                                i0.s0(parcel, iF1, 8);
                                lValueOf2 = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf2 = null;
                            }
                            break;
                        case 5:
                            int iF2 = i0.f0(parcel, i24);
                            if (iF2 != 0) {
                                i0.s0(parcel, iF2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strV12 = i0.v(parcel, i24);
                            break;
                        case 7:
                            strV13 = i0.v(parcel, i24);
                            break;
                        case '\b':
                            int iF3 = i0.f0(parcel, i24);
                            if (iF3 != 0) {
                                i0.s0(parcel, iF3, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            i0.l0(parcel, i24);
                            break;
                    }
                }
                i0.D(parcel, iO10);
                return new i4(iD4, strV11, jE10, lValueOf2, fValueOf, strV12, strV13, dValueOf);
            default:
                int iO11 = i0.o0(parcel);
                String strV14 = "";
                String strV15 = strV14;
                String strV16 = strV15;
                String strV17 = strV16;
                int iD5 = 100;
                long jE11 = 0;
                long jE12 = 0;
                long jE13 = 0;
                long jE14 = 0;
                long jE15 = 0;
                long jE16 = 0;
                long jE17 = 0;
                long jE18 = 0;
                boolean zA3 = true;
                boolean zA4 = true;
                boolean zA5 = false;
                int iD6 = 0;
                boolean zA6 = false;
                boolean zA7 = false;
                int iD7 = 0;
                int iD8 = 0;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                String strV22 = null;
                String strV23 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListX2 = null;
                String strV24 = null;
                String strV25 = null;
                long jE19 = -2147483648L;
                while (parcel.dataPosition() < iO11) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            strV18 = i0.v(parcel, i25);
                            break;
                        case 3:
                            strV19 = i0.v(parcel, i25);
                            break;
                        case 4:
                            strV20 = i0.v(parcel, i25);
                            break;
                        case 5:
                            strV21 = i0.v(parcel, i25);
                            break;
                        case 6:
                            jE11 = i0.e0(parcel, i25);
                            break;
                        case 7:
                            jE12 = i0.e0(parcel, i25);
                            break;
                        case '\b':
                            strV22 = i0.v(parcel, i25);
                            break;
                        case '\t':
                            zA3 = i0.a0(parcel, i25);
                            break;
                        case '\n':
                            zA5 = i0.a0(parcel, i25);
                            break;
                        case 11:
                            jE19 = i0.e0(parcel, i25);
                            break;
                        case '\f':
                            strV23 = i0.v(parcel, i25);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            i0.l0(parcel, i25);
                            break;
                        case 14:
                            jE13 = i0.e0(parcel, i25);
                            break;
                        case 15:
                            iD6 = i0.d0(parcel, i25);
                            break;
                        case 16:
                            zA4 = i0.a0(parcel, i25);
                            break;
                        case 18:
                            zA6 = i0.a0(parcel, i25);
                            break;
                        case 21:
                            int iF4 = i0.f0(parcel, i25);
                            if (iF4 != 0) {
                                i0.s0(parcel, iF4, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jE14 = i0.e0(parcel, i25);
                            break;
                        case 23:
                            arrayListX2 = i0.x(parcel, i25);
                            break;
                        case 25:
                            strV14 = i0.v(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                            strV15 = i0.v(parcel, i25);
                            break;
                        case 27:
                            strV24 = i0.v(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                            zA7 = i0.a0(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                            jE15 = i0.e0(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                            iD5 = i0.d0(parcel, i25);
                            break;
                        case 31:
                            strV16 = i0.v(parcel, i25);
                            break;
                        case ' ':
                            iD7 = i0.d0(parcel, i25);
                            break;
                        case '\"':
                            jE16 = i0.e0(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            strV25 = i0.v(parcel, i25);
                            break;
                        case '$':
                            strV17 = i0.v(parcel, i25);
                            break;
                        case '%':
                            jE17 = i0.e0(parcel, i25);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            iD8 = i0.d0(parcel, i25);
                            break;
                        case '\'':
                            jE18 = i0.e0(parcel, i25);
                            break;
                    }
                }
                i0.D(parcel, iO11);
                return new n4(strV18, strV19, strV20, strV21, jE11, jE12, strV22, zA3, zA5, jE19, strV23, jE13, iD6, zA4, zA6, boolValueOf, jE14, arrayListX2, strV14, strV15, strV24, zA7, jE15, iD5, strV16, iD7, jE16, strV25, strV17, jE17, iD8, jE18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f3808a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new MediaSessionCompat$QueueItem[i10];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 6:
                return new MediaSessionCompat$Token[i10];
            case 7:
                return new ParcelableVolumeInfo[i10];
            case 8:
                return new PlaybackStateCompat[i10];
            case 9:
                return new androidx.fragment.app.b[i10];
            case 10:
                return new c[i10];
            case 11:
                return new c1[i10];
            case 12:
                return new i1[i10];
            case 13:
                return new m1[i10];
            case 14:
                return new z[i10];
            case 15:
                return new androidx.recyclerview.widget.m1[i10];
            case 16:
                return new n1[i10];
            case 17:
                return new TokenData[i10];
            case 18:
                return new d[i10];
            case 19:
                return new ea.d[i10];
            case 20:
                return new ea.e[i10];
            case 21:
                return new i[i10];
            case 22:
                return new t[i10];
            case 23:
                return new u[i10];
            case 24:
                return new t3[i10];
            case 25:
                return new w3[i10];
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new x3[i10];
            case 27:
                return new y3[i10];
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return new i4[i10];
            default:
                return new n4[i10];
        }
    }
}
