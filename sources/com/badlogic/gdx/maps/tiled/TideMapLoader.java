package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.ImageResolver;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.tiles.AnimatedTiledMapTile;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.XmlReader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class TideMapLoader extends SynchronousAssetLoader<TiledMap, Parameters> {
    private XmlReader.Element root;
    private XmlReader xml;

    public static class Parameters extends AssetLoaderParameters<TiledMap> {
    }

    public TideMapLoader() {
        super(new InternalFileHandleResolver());
        this.xml = new XmlReader();
    }

    private static FileHandle getRelativeFileHandle(FileHandle fileHandle, String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\\/");
        FileHandle fileHandleParent = fileHandle.parent();
        while (stringTokenizer.hasMoreElements()) {
            String strNextToken = stringTokenizer.nextToken();
            fileHandleParent = strNextToken.equals("..") ? fileHandleParent.parent() : fileHandleParent.child(strNextToken);
        }
        return fileHandleParent;
    }

    private void loadLayer(TiledMap tiledMap, XmlReader.Element element) {
        int i;
        if (element.getName().equals("Layer")) {
            String attribute = element.getAttribute("Id");
            String attribute2 = element.getAttribute("Visible");
            XmlReader.Element childByName = element.getChildByName("Dimensions");
            String attribute3 = childByName.getAttribute("LayerSize");
            String attribute4 = childByName.getAttribute("TileSize");
            String[] strArrSplit = attribute3.split(" x ");
            int i2 = Integer.parseInt(strArrSplit[0]);
            int i3 = Integer.parseInt(strArrSplit[1]);
            String[] strArrSplit2 = attribute4.split(" x ");
            TiledMapTileLayer tiledMapTileLayer = new TiledMapTileLayer(i2, i3, Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]));
            tiledMapTileLayer.setName(attribute);
            tiledMapTileLayer.setVisible(attribute2.equalsIgnoreCase("True"));
            Array<XmlReader.Element> childrenByName = element.getChildByName("TileArray").getChildrenByName("Row");
            TiledMapTileSets tileSets = tiledMap.getTileSets();
            int i4 = childrenByName.size;
            TiledMapTileSet tileSet = null;
            int i5 = 0;
            int iIntValue = 0;
            while (i5 < i4) {
                XmlReader.Element element2 = childrenByName.get(i5);
                int i6 = (i4 - 1) - i5;
                int childCount = element2.getChildCount();
                int i7 = 0;
                int intAttribute = 0;
                while (i7 < childCount) {
                    XmlReader.Element child = element2.getChild(i7);
                    String name = child.getName();
                    Array<XmlReader.Element> array = childrenByName;
                    int i8 = i4;
                    XmlReader.Element element3 = element2;
                    if (name.equals("TileSheet")) {
                        tileSet = tileSets.getTileSet(child.getAttribute("Ref"));
                        iIntValue = ((Integer) tileSet.getProperties().get("firstgid", Integer.class)).intValue();
                        i = childCount;
                    } else {
                        i = childCount;
                        if (name.equals("Null")) {
                            intAttribute += child.getIntAttribute("Count");
                        } else {
                            if (name.equals("Static")) {
                                TiledMapTileLayer.Cell cell = new TiledMapTileLayer.Cell();
                                cell.setTile(tileSet.getTile(child.getIntAttribute("Index") + iIntValue));
                                tiledMapTileLayer.setCell(intAttribute, i6, cell);
                                intAttribute++;
                            } else {
                                TiledMapTileSet tiledMapTileSet = tileSet;
                                if (name.equals("Animated")) {
                                    int i9 = child.getInt("Interval");
                                    XmlReader.Element childByName2 = child.getChildByName("Frames");
                                    Array array2 = new Array();
                                    int iIntValue2 = iIntValue;
                                    int childCount2 = childByName2.getChildCount();
                                    i5 = i5;
                                    TiledMapTileSet tileSet2 = tiledMapTileSet;
                                    int i10 = 0;
                                    while (i10 < childCount2) {
                                        int i11 = childCount2;
                                        XmlReader.Element child2 = childByName2.getChild(i10);
                                        XmlReader.Element element4 = childByName2;
                                        String name2 = child2.getName();
                                        if (name2.equals("TileSheet")) {
                                            tileSet2 = tileSets.getTileSet(child2.getAttribute("Ref"));
                                            iIntValue2 = ((Integer) tileSet2.getProperties().get("firstgid", Integer.class)).intValue();
                                        } else if (name2.equals("Static")) {
                                            array2.add((StaticTiledMapTile) tileSet2.getTile(child2.getIntAttribute("Index") + iIntValue2));
                                        }
                                        i10++;
                                        childCount2 = i11;
                                        childByName2 = element4;
                                    }
                                    TiledMapTileLayer.Cell cell2 = new TiledMapTileLayer.Cell();
                                    cell2.setTile(new AnimatedTiledMapTile(i9 / 1000.0f, (Array<StaticTiledMapTile>) array2));
                                    tiledMapTileLayer.setCell(intAttribute, i6, cell2);
                                    intAttribute++;
                                    tileSet = tileSet2;
                                    iIntValue = iIntValue2;
                                } else {
                                    i5 = i5;
                                    tileSet = tiledMapTileSet;
                                }
                            }
                            i7++;
                            childCount = i;
                            childrenByName = array;
                            i4 = i8;
                            element2 = element3;
                            i5 = i5;
                        }
                    }
                    i7++;
                    childCount = i;
                    childrenByName = array;
                    i4 = i8;
                    element2 = element3;
                    i5 = i5;
                }
                i5++;
            }
            XmlReader.Element childByName3 = element.getChildByName("Properties");
            if (childByName3 != null) {
                loadProperties(tiledMapTileLayer.getProperties(), childByName3);
            }
            tiledMap.getLayers().add(tiledMapTileLayer);
        }
    }

    private TiledMap loadMap(XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        TiledMap tiledMap = new TiledMap();
        XmlReader.Element childByName = element.getChildByName("Properties");
        if (childByName != null) {
            loadProperties(tiledMap.getProperties(), childByName);
        }
        Array.ArrayIterator<XmlReader.Element> it = element.getChildByName("TileSheets").getChildrenByName("TileSheet").iterator();
        while (it.hasNext()) {
            loadTileSheet(tiledMap, it.next(), fileHandle, imageResolver);
        }
        Array.ArrayIterator<XmlReader.Element> it2 = element.getChildByName("Layers").getChildrenByName("Layer").iterator();
        while (it2.hasNext()) {
            loadLayer(tiledMap, it2.next());
        }
        return tiledMap;
    }

    private void loadProperties(MapProperties mapProperties, XmlReader.Element element) {
        if (element.getName().equals("Properties")) {
            Array.ArrayIterator<XmlReader.Element> it = element.getChildrenByName("Property").iterator();
            while (it.hasNext()) {
                XmlReader.Element next = it.next();
                String attribute = next.getAttribute("Key", null);
                String attribute2 = next.getAttribute("Type", null);
                String text = next.getText();
                if (attribute2.equals("Int32")) {
                    mapProperties.put(attribute, Integer.valueOf(Integer.parseInt(text)));
                } else if (attribute2.equals("String")) {
                    mapProperties.put(attribute, text);
                } else if (attribute2.equals("Boolean")) {
                    mapProperties.put(attribute, Boolean.valueOf(text.equalsIgnoreCase("true")));
                } else {
                    mapProperties.put(attribute, text);
                }
            }
        }
    }

    private void loadTileSheet(TiledMap tiledMap, XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        if (element.getName().equals("TileSheet")) {
            String attribute = element.getAttribute("Id");
            element.getChildByName("Description").getText();
            String text = element.getChildByName("ImageSource").getText();
            XmlReader.Element childByName = element.getChildByName("Alignment");
            String attribute2 = childByName.getAttribute("SheetSize");
            String attribute3 = childByName.getAttribute("TileSize");
            String attribute4 = childByName.getAttribute("Margin");
            childByName.getAttribute("Spacing");
            String[] strArrSplit = attribute2.split(" x ");
            Integer.parseInt(strArrSplit[0]);
            int size = 1;
            Integer.parseInt(strArrSplit[1]);
            String[] strArrSplit2 = attribute3.split(" x ");
            int i = Integer.parseInt(strArrSplit2[0]);
            int i2 = Integer.parseInt(strArrSplit2[1]);
            String[] strArrSplit3 = attribute4.split(" x ");
            int i3 = Integer.parseInt(strArrSplit3[0]);
            int i4 = Integer.parseInt(strArrSplit3[1]);
            String[] strArrSplit4 = attribute4.split(" x ");
            int i5 = Integer.parseInt(strArrSplit4[0]);
            int i6 = Integer.parseInt(strArrSplit4[1]);
            TextureRegion image = imageResolver.getImage(getRelativeFileHandle(fileHandle, text).path());
            TiledMapTileSets tileSets = tiledMap.getTileSets();
            Iterator<TiledMapTileSet> it = tileSets.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            TiledMapTileSet tiledMapTileSet = new TiledMapTileSet();
            tiledMapTileSet.setName(attribute);
            tiledMapTileSet.getProperties().put("firstgid", Integer.valueOf(size));
            int regionWidth = image.getRegionWidth() - i;
            int regionHeight = image.getRegionHeight() - i2;
            int i7 = i4;
            while (i7 <= regionHeight) {
                int i8 = i3;
                while (i8 <= regionWidth) {
                    int i9 = regionWidth;
                    TextureRegion textureRegion = image;
                    TextureRegion textureRegion2 = image;
                    TiledMapTileSet tiledMapTileSet2 = tiledMapTileSet;
                    StaticTiledMapTile staticTiledMapTile = new StaticTiledMapTile(new TextureRegion(textureRegion, i8, i7, i, i2));
                    staticTiledMapTile.setId(size);
                    tiledMapTileSet2.putTile(size, staticTiledMapTile);
                    i8 = i + i5 + i8;
                    regionWidth = i9;
                    tiledMapTileSet = tiledMapTileSet2;
                    size++;
                    regionHeight = regionHeight;
                    image = textureRegion2;
                }
                int i10 = regionWidth;
                i7 = i2 + i6 + i7;
                regionWidth = i10;
                image = image;
            }
            TiledMapTileSet tiledMapTileSet3 = tiledMapTileSet;
            XmlReader.Element childByName2 = element.getChildByName("Properties");
            if (childByName2 != null) {
                loadProperties(tiledMapTileSet3.getProperties(), childByName2);
            }
            tileSets.addTileSet(tiledMapTileSet3);
        }
    }

    private Array<FileHandle> loadTileSheets(XmlReader.Element element, FileHandle fileHandle) throws IOException {
        Array<FileHandle> array = new Array<>();
        Array.ArrayIterator<XmlReader.Element> it = element.getChildByName("TileSheets").getChildrenByName("TileSheet").iterator();
        while (it.hasNext()) {
            array.add(getRelativeFileHandle(fileHandle, it.next().getChildByName("ImageSource").getText()));
        }
        return array;
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, Parameters parameters) {
        Array<AssetDescriptor> array = new Array<>();
        try {
            XmlReader.Element element = this.xml.parse(fileHandle);
            this.root = element;
            Array.ArrayIterator<FileHandle> it = loadTileSheets(element, fileHandle).iterator();
            while (it.hasNext()) {
                array.add(new AssetDescriptor(it.next().path(), Texture.class));
            }
            return array;
        } catch (IOException e) {
            throw new GdxRuntimeException(DM.B("Couldn't load tilemap '", str, "'"), e);
        }
    }

    public TiledMap load(String str) {
        try {
            FileHandle fileHandleResolve = resolve(str);
            this.root = this.xml.parse(fileHandleResolve);
            ObjectMap objectMap = new ObjectMap();
            Array.ArrayIterator<FileHandle> it = loadTileSheets(this.root, fileHandleResolve).iterator();
            while (it.hasNext()) {
                FileHandle next = it.next();
                objectMap.put(next.path(), new Texture(next));
            }
            TiledMap tiledMapLoadMap = loadMap(this.root, fileHandleResolve, new ImageResolver.DirectImageResolver(objectMap));
            tiledMapLoadMap.setOwnedResources(objectMap.values().toArray());
            return tiledMapLoadMap;
        } catch (IOException e) {
            throw new GdxRuntimeException(DM.B("Couldn't load tilemap '", str, "'"), e);
        }
    }

    public TideMapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.xml = new XmlReader();
    }

    @Override // com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
    public TiledMap load(AssetManager assetManager, String str, FileHandle fileHandle, Parameters parameters) {
        try {
            return loadMap(this.root, fileHandle, new ImageResolver.AssetManagerImageResolver(assetManager));
        } catch (Exception e) {
            throw new GdxRuntimeException(DM.B("Couldn't load tilemap '", str, "'"), e);
        }
    }
}
