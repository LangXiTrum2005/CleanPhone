package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.media3.extractor.text.ttml.a;

/* JADX INFO: loaded from: classes3.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z2, boolean z3, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z2) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb.append(packageName);
                sb.append(":string/");
                sb.append(strSubstring);
                resources.getValue(sb.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                Log.w(str3, a.q(new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length()), "Could not find resource for ", str2, ": ", attributeValue));
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String string = typedValue.toString();
                Log.w(str3, a.q(new StringBuilder(String.valueOf(str2).length() + 28 + string.length()), "Resource ", str2, " was not a string: ", string));
            }
        }
        if (z3 && attributeValue == null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb2.append("Required XML attribute \"");
            sb2.append(str2);
            sb2.append("\" missing");
            Log.w(str3, sb2.toString());
        }
        return attributeValue;
    }
}
