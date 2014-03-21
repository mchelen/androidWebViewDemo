minimal demo of android webview

loads local html file from `assets` directory

runs javascript

preserves state during rotation

compile:

    ant debug
  
  
install:

    adb -d install -r ./bin/WebViewDemo-debug.apk
  
  
references:

http://developer.android.com/guide/webapps/webview.html

http://www.devahead.com/blog/2012/01/preserving-the-state-of-an-android-webview-on-screen-orientation-change/
