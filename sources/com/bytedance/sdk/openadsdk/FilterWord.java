package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FilterWord {
    private boolean lnr;
    private List<FilterWord> mml;
    private String qdl;
    private String ud;

    public FilterWord(String str, String str2) {
        this.qdl = str;
        this.ud = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.mml == null) {
            this.mml = new ArrayList();
        }
        this.mml.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.qdl;
    }

    public boolean getIsSelected() {
        return this.lnr;
    }

    public String getName() {
        return this.ud;
    }

    public List<FilterWord> getOptions() {
        return this.mml;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.mml;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.qdl) || TextUtils.isEmpty(this.ud)) ? false : true;
    }

    public void setId(String str) {
        this.qdl = str;
    }

    public void setIsSelected(boolean z2) {
        this.lnr = z2;
    }

    public void setName(String str) {
        this.ud = str;
    }

    public FilterWord() {
    }
}
