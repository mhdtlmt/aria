/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.simple.core.download.group;

import android.content.Context;
import com.arialyy.simple.R;
import com.arialyy.simple.base.BaseModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lyy on 2017/7/6.
 */
public class GroupModule extends BaseModule {
  public GroupModule(Context context) {
    super(context);
  }

  public List<String> getUrls() {
    List<String> urls = new ArrayList<>();
    urls.add("http://61.155.99.75:88/sdkdown.muzhiwan.com/openfile/2019/10/26/com.mrxz.mzw_5db3eeef782b1.apk");
    urls.add("http://cpsdown.muzhiwan.com/2020/05/07/com.kaihei.wufan.mars_5eb3947b4341b.apk");
    urls.add("http://113.143.35.118:88/sdkdown.muzhiwan.com/openfile/2019/11/27/com.droidhang.ad.mzw_5dde4ffe2b2e5.apk");
    return urls;
  }
  List<String> getUrls1() {
    List<String> urls = new ArrayList<>();
    //String[] str = getContext().getResources().getStringArray(R.array.group_urls);
    //Collections.addAll(urls, str);
    urls.add(
        "https://d.pcs.baidu.com/file/130335545f3f4d9cc38afe709c19af5a?fid=1411168371-250528-1010657263806840&dstime=1531134607&rt=sh&sign=FDtAERVY-DCb740ccc5511e5e8fedcff06b081203-sNCujT7lC42aMcfiHcgqAzYHuw4%3D&expires=8h&chkv=1&chkbd=0&chkpc=et&dp-logid=4401967667009194668&dp-callid=0&r=540192514");
    return urls;
  }

  List<String> getSubName() {
    List<String> names = new ArrayList<>();
    //String[] str = getContext().getResources().getStringArray(R.array.group_names);
    //Collections.addAll(names, str);
    names.add("末日血战.apk");
    names.add("开黑三国.apk");
    names.add("放置奇兵.apk");
    //names.add("4.png");
    //names.add("5.png");
    return names;
  }

  List<String> getSubName1() {
    List<String> names = new ArrayList<>();
    String[] str = getContext().getResources().getStringArray(R.array.group_names);
    Collections.addAll(names, str);
    return names;
  }

  List<String> getSubName2() {
    List<String> taskSubFile;
    taskSubFile = new ArrayList<>();
    //taskSubFile.add("2156.mp4");
    //        taskSubFile.add("2115.mp4");
    //taskSubFile.add("2009.mp4");
    //taskSubFile.add("1893.mp4");
    taskSubFile.add("1952.mp4");
    taskSubFile.add("1958.mp4");
    taskSubFile.add("1994.mp4");
    //taskSubFile.add("2083.mp4");
    taskSubFile.add("2305.JPG");
    taskSubFile.add("2183.JPG");
    taskSubFile.add("2154.JPG");
    taskSubFile.add("2153.JPG");
    taskSubFile.add("2152.JPG");
    taskSubFile.add("2151.JPG");
    taskSubFile.add("2149.JPG");
    taskSubFile.add("2148.JPG");
    taskSubFile.add("2147.JPG");
    taskSubFile.add("2146.JPG");
    taskSubFile.add("1949.JPG");
    taskSubFile.add("1887.JPG");
    taskSubFile.add("1996.txt");
    return taskSubFile;
  }

  public List<String> getUrls2() {
    List<String> downLoadUrls;
    downLoadUrls = new ArrayList<>();
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2156&clientId=A000011106034058176");
    //        downLoadUrls.add("http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2115&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2009&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1893&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1952&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1958&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1994&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2083&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2305&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2183&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2154&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2153&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2152&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2151&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2149&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2148&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2147&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2146&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1949&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1887&clientId=A000011106034058176");
    downLoadUrls.add(
        "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1996&clientId=A000011106034058176");
    return downLoadUrls;
  }
}
