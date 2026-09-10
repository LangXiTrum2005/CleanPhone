package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18224Y;
    public final ImmutableList Z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            String string2 = parcel.readString();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            return new TextInformationFrame(string, string2, ImmutableList.v(strArrCreateStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        Assertions.b(!((AbstractCollection) list).isEmpty());
        this.f18224Y = str2;
        ImmutableList immutableListU = ImmutableList.u(list);
        this.Z = immutableListU;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (Util.a(this.X, textInformationFrame.X) && Util.a(this.f18224Y, textInformationFrame.f18224Y) && this.Z.equals(textInformationFrame.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f18224Y;
        return this.Z.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void l(MediaMetadata.Builder builder) {
        byte b2;
        String str = this.X;
        str.getClass();
        ImmutableList immutableList = this.Z;
        switch (str) {
            case "TAL":
                b2 = 0;
                break;
            case "TCM":
                b2 = 1;
                break;
            case "TDA":
                b2 = 2;
                break;
            case "TP1":
                b2 = 3;
                break;
            case "TP2":
                b2 = 4;
                break;
            case "TP3":
                b2 = 5;
                break;
            case "TRK":
                b2 = 6;
                break;
            case "TT2":
                b2 = 7;
                break;
            case "TXT":
                b2 = 8;
                break;
            case "TYE":
                b2 = 9;
                break;
            case "TALB":
                b2 = 10;
                break;
            case "TCOM":
                b2 = 11;
                break;
            case "TDAT":
                b2 = 12;
                break;
            case "TDRC":
                b2 = 13;
                break;
            case "TDRL":
                b2 = 14;
                break;
            case "TEXT":
                b2 = 15;
                break;
            case "TIT2":
                b2 = 16;
                break;
            case "TPE1":
                b2 = 17;
                break;
            case "TPE2":
                b2 = 18;
                break;
            case "TPE3":
                b2 = 19;
                break;
            case "TRCK":
                b2 = 20;
                break;
            case "TYER":
                b2 = 21;
                break;
            default:
                b2 = -1;
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 10:
                    builder.f17127c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    builder.y = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case 12:
                    String str2 = (String) immutableList.get(0);
                    int i2 = Integer.parseInt(str2.substring(2, 4));
                    int i3 = Integer.parseInt(str2.substring(0, 2));
                    builder.s = Integer.valueOf(i2);
                    builder.t = Integer.valueOf(i3);
                    break;
                case 3:
                case 17:
                    builder.f17126b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 18:
                    builder.d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 19:
                    builder.f17136z = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 20:
                    String str3 = (String) immutableList.get(0);
                    int i4 = Util.f18979a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    builder.m = Integer.valueOf(i5);
                    builder.f17132n = numValueOf;
                    break;
                case 7:
                case 16:
                    builder.f17125a = (CharSequence) immutableList.get(0);
                    break;
                case 8:
                case 15:
                    builder.x = (CharSequence) immutableList.get(0);
                    break;
                case 9:
                case 21:
                    builder.r = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case 13:
                    ArrayList arrayListA = a((String) immutableList.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.t = (Integer) arrayListA.get(2);
                            }
                        }
                        builder.s = (Integer) arrayListA.get(1);
                    }
                    builder.r = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a((String) immutableList.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.f17135w = (Integer) arrayListA2.get(2);
                            }
                        }
                        builder.v = (Integer) arrayListA2.get(1);
                    }
                    builder.f17134u = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": description=" + this.f18224Y + ": values=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f18224Y);
        parcel.writeStringArray((String[]) this.Z.toArray(new String[0]));
    }
}
