package sealless;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.AutofillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.NotImplementedError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsealless/wireman;", "Landroid/view/ViewStructure;", "root", "", "saneness", "(Lsealless/wireman;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "attabal", "(Lsealless/wireman;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class competently {
    public static final void attabal(wireman wiremanVar, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueAttabal = beachfront.attabal(sparseArray.get(iKeyAt));
            molybdenite molybdeniteVar = molybdenite.f37445attabal;
            if (molybdeniteVar.wireman(autofillValueAttabal)) {
                wiremanVar.getAutofillTree().saneness(iKeyAt, molybdeniteVar.taiyuan(autofillValueAttabal).toString());
            } else {
                if (molybdeniteVar.saneness(autofillValueAttabal)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (molybdeniteVar.dern(autofillValueAttabal)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (molybdeniteVar.marial(autofillValueAttabal)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void saneness(wireman wiremanVar, ViewStructure viewStructure) {
        int iAttabal = taiyuan.f37452attabal.attabal(viewStructure, wiremanVar.getAutofillTree().attabal().size());
        for (Map.Entry<Integer, rotuma> entry : wiremanVar.getAutofillTree().attabal().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            rotuma value = entry.getValue();
            taiyuan taiyuanVar = taiyuan.f37452attabal;
            ViewStructure viewStructureSaneness = taiyuanVar.saneness(viewStructure, iAttabal);
            if (viewStructureSaneness != null) {
                molybdenite molybdeniteVar = molybdenite.f37445attabal;
                AutofillId autofillIdAttabal = molybdeniteVar.attabal(viewStructure);
                Intrinsics.beachfront(autofillIdAttabal);
                molybdeniteVar.competently(viewStructureSaneness, autofillIdAttabal, iIntValue);
                taiyuanVar.wireman(viewStructureSaneness, iIntValue, wiremanVar.getCom.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW java.lang.String().getContext().getPackageName(), null, null);
                molybdeniteVar.impromptu(viewStructureSaneness, cord.INSTANCE.attabal());
                List<AutofillType> listAttabal = value.attabal();
                ArrayList arrayList = new ArrayList(listAttabal.size());
                int size = listAttabal.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(marial.attabal(listAttabal.get(i)));
                }
                molybdeniteVar.beachfront(viewStructureSaneness, (String[]) arrayList.toArray(new String[0]));
                supplicat.taiyuan boundingBox = value.getBoundingBox();
                if (boundingBox != null) {
                    int iRound = Math.round(boundingBox.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String());
                    int iRound2 = Math.round(boundingBox.getTop());
                    int iRound3 = Math.round(boundingBox.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String());
                    taiyuan.f37452attabal.dern(viewStructureSaneness, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
                }
            }
            iAttabal++;
        }
    }
}
