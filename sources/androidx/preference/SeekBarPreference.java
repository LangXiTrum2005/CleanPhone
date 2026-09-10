package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import y3.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4676i;

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f54202i, R.attr.seekBarPreferenceStyle, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i11 = i11 < i10 ? i10 : i11;
        if (i11 != this.f4675h) {
            this.f4675h = i11;
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i12 != this.f4676i) {
            this.f4676i = Math.min(this.f4675h - i10, Math.abs(i12));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }
}
