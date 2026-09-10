package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleOverlayHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi {
    public static claque.taiyuan attabal(claque.taiyuan taiyuanVar, claque.taiyuan taiyuanVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < taiyuanVar.beachfront() + taiyuanVar2.beachfront()) {
            Locale localeDern = i < taiyuanVar.beachfront() ? taiyuanVar.dern(i) : taiyuanVar2.dern(i - taiyuanVar.beachfront());
            if (localeDern != null) {
                linkedHashSet.add(localeDern);
            }
            i++;
        }
        return claque.taiyuan.attabal((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static claque.taiyuan saneness(claque.taiyuan taiyuanVar, claque.taiyuan taiyuanVar2) {
        return (taiyuanVar == null || taiyuanVar.marial()) ? claque.taiyuan.wireman() : attabal(taiyuanVar, taiyuanVar2);
    }
}
