package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.premeiotic;
import java.util.Objects;

/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible {

    /* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
    public static final class attabal {
        public static boolean attabal(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                premeiotic.cultivated(textView, new androidx.core.view.wireman.attabal(dragEvent.getClipData(), 3).attabal());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        public static boolean saneness(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            premeiotic.cultivated(view, new androidx.core.view.wireman.attabal(dragEvent.getClipData(), 3).attabal());
            return true;
        }
    }

    public static boolean attabal(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && premeiotic.trm(view) != null) {
            Activity activityDern = dern(view);
            if (activityDern == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? attabal.attabal(dragEvent, (TextView) view, activityDern) : attabal.saneness(dragEvent, view, activityDern);
            }
        }
        return false;
    }

    public static Activity dern(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static boolean saneness(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || premeiotic.trm(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            premeiotic.cultivated(textView, new androidx.core.view.wireman.attabal(primaryClip, 1).dern(i != 16908322 ? 1 : 0).attabal());
        }
        return true;
    }
}
