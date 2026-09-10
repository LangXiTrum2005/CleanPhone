package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4014k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f4017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f4018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f4021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4024j;

    public IconCompat() {
        this.f4015a = -1;
        this.f4017c = null;
        this.f4018d = null;
        this.f4019e = 0;
        this.f4020f = 0;
        this.f4021g = null;
        this.f4022h = f4014k;
        this.f4023i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f4019e = bundle.getInt("int1");
        iconCompat.f4020f = bundle.getInt("int2");
        iconCompat.f4024j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f4021g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f4022h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f4016b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                u.o(i10, "Unknown type ", "IconCompat");
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f4016b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f4016b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4016b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Context context, int i10) {
        context.getClass();
        return d(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4019e = i10;
        if (resources != null) {
            try {
                iconCompat.f4016b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4016b = str;
        }
        iconCompat.f4024j = str;
        return iconCompat;
    }

    public final int e() {
        int i10 = this.f4015a;
        if (i10 == -1) {
            return ((Icon) this.f4016b).getResId();
        }
        if (i10 == 2) {
            return this.f4019e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri f() {
        int i10 = this.f4015a;
        if (i10 == -1) {
            return ((Icon) this.f4016b).getUri();
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f4016b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon g() {
        Icon iconCreateWithBitmap;
        String resPackage;
        switch (this.f4015a) {
            case -1:
                return (Icon) this.f4016b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f4016b);
                break;
            case 2:
                int i10 = this.f4015a;
                if (i10 == -1) {
                    resPackage = ((Icon) this.f4016b).getResPackage();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f4024j;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f4016b).split(":", -1)[0] : this.f4024j;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, this.f4019e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f4016b, this.f4019e, this.f4020f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f4016b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f4016b);
                break;
            case 6:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(f());
                break;
        }
        ColorStateList colorStateList = this.f4021g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f4022h;
        if (mode != f4014k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f4015a == -1) {
            return String.valueOf(this.f4016b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f4015a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f4015a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f4016b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f4016b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f4024j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f4019e);
                if (this.f4020f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f4020f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f4016b);
                break;
        }
        if (this.f4021g != null) {
            sb2.append(" tint=");
            sb2.append(this.f4021g);
        }
        if (this.f4022h != f4014k) {
            sb2.append(" mode=");
            sb2.append(this.f4022h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f4017c = null;
        this.f4018d = null;
        this.f4019e = 0;
        this.f4020f = 0;
        this.f4021g = null;
        this.f4022h = f4014k;
        this.f4023i = null;
        this.f4015a = i10;
    }
}
