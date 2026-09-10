package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "Landroid/content/res/TypedArray;", "typedArray", "", "index", "Landroid/graphics/Typeface;", "a", "(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TypedArrayApi26ImplKt {
    @JvmStatic
    public static final Typeface a(TypedArray typedArray, int index) {
        Typeface font = typedArray.getFont(index);
        Intrinsics.c(font);
        return font;
    }
}
