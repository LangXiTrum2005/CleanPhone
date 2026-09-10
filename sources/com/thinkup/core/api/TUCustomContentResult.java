package com.thinkup.core.api;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TUCustomContentResult {
    List<TUCustomContentInfo> customContentInfoList;

    public TUCustomContentResult(List<TUCustomContentInfo> list) {
        this.customContentInfoList = list;
    }

    public List<TUCustomContentInfo> getCustomContentInfoList() {
        return this.customContentInfoList;
    }
}
