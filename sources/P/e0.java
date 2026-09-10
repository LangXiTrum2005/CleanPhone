package p;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        m0.d cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new m0.c(clipData, 3);
            } else {
                m0.e eVar = new m0.e();
                eVar.f45685b = clipData;
                eVar.f45686c = 3;
                cVar = eVar;
            }
            m0.s0.e(textView, cVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        m0.d cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new m0.c(clipData, 3);
        } else {
            m0.e eVar = new m0.e();
            eVar.f45685b = clipData;
            eVar.f45686c = 3;
            cVar = eVar;
        }
        m0.s0.e(view, cVar.build());
        return true;
    }
}
