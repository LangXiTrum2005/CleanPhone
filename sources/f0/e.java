package f0;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import ea.a0;
import j0.i;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a0 {
    @Override // ea.a0
    public final Font r(i iVar) {
        Font fontF;
        Uri uri = iVar.f43569a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = iVar.f43573e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontF = d.f(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontF;
                }
                try {
                    return new Font.Builder(fontF).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
