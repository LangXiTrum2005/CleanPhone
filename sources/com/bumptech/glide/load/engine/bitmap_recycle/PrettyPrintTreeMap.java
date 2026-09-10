package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.v4.media.a;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sbW = a.w("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbW.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sbW.append(entry.getKey());
            sbW.append(AbstractJsonLexerKt.COLON);
            sbW.append(entry.getValue());
            sbW.append("}, ");
        }
        if (!isEmpty()) {
            sbW.replace(sbW.length() - 2, sbW.length(), "");
        }
        sbW.append(" )");
        return sbW.toString();
    }
}
