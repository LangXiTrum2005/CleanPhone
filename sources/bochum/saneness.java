package bochum;

import com.google.firebase.components.ComponentRegistrar;
import inblowing.competently;
import inblowing.taiyuan;
import inblowing.wireman;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ComponentMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements taiyuan {
    public static /* synthetic */ Object saneness(String str, inblowing.dern dernVar, wireman wiremanVar) {
        try {
            dern.saneness(str);
            return dernVar.impromptu().attabal(wiremanVar);
        } finally {
            dern.attabal();
        }
    }

    @Override // inblowing.taiyuan
    public List<inblowing.dern<?>> attabal(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final inblowing.dern<?> dernVarPolloi : componentRegistrar.getComponents()) {
            final String strTaiyuan = dernVarPolloi.taiyuan();
            if (strTaiyuan != null) {
                dernVarPolloi = dernVarPolloi.polloi(new competently() { // from class: bochum.attabal
                    @Override // inblowing.competently
                    public final Object attabal(wireman wiremanVar) {
                        return saneness.saneness(strTaiyuan, dernVarPolloi, wiremanVar);
                    }
                });
            }
            arrayList.add(dernVarPolloi);
        }
        return arrayList;
    }
}
