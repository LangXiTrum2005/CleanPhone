package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {

    public static final class OnDropApi24Impl {
        public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.u(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        public static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.u(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).a());
            return true;
        }
    }
}
