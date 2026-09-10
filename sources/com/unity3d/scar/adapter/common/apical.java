package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: WebViewAdsError.java */
/* JADX INFO: loaded from: classes4.dex */
public class apical implements impromptu {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public apical(Enum<?> r1, String str, Object... objArr) {
        this._errorCategory = r1;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
