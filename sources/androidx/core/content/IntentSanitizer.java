package androidx.core.content;

import android.content.ClipData;
import android.content.Intent;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class IntentSanitizer {

    public static class Api29Impl {
        public static String a(Intent intent) {
            return intent.getIdentifier();
        }

        public static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    public static class Api31Impl {
        public static void a(int i2, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            consumer.accept("ClipData item at position " + i2 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    public static final class Builder {
    }
}
