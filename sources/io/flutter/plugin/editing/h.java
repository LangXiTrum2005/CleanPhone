package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f43283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextServicesManager f43284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f43285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wi.j f43286d;

    public h(TextServicesManager textServicesManager, x xVar) {
        this.f43284b = textServicesManager;
        this.f43283a = xVar;
        xVar.f49096b = this;
    }

    public final void a(String str, String str2, wi.j jVar) {
        if (this.f43286d != null) {
            jVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f43286d = jVar;
        Locale localeA = yi.a.a(str);
        if (this.f43285c == null) {
            this.f43285c = this.f43284b.newSpellCheckerSession(null, localeA, this, true);
        }
        this.f43285c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f43286d.a(new ArrayList());
            this.f43286d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f43286d.a(new ArrayList());
            this.f43286d = null;
            return;
        }
        for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = false;
                for (int i11 = 0; i11 < suggestionsCount; i11++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i11);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z10 = true;
                    }
                }
                if (z10) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f43286d.a(arrayList);
        this.f43286d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
