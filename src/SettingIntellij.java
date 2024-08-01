public class SettingIntellij {
    /*--------------------------------------------------------------------------------------
        1. Tên folder và tên project không dấu, không khoảng trắng; thì không chạy code được (lúc lỗi thì khi nhìn lỗi, sẽ không biết được tại sao
        Playwright của Microsoft để test web và API, đi sau Selenium và Cypress nhưng nó phát triển rất nhanh
        2. File > Project Structure : coi được phiên bản JDK đang dùng;
        nếu version jdk của project khác với version jdk có sẵn trong máy; thì sẽ có báo lỗi "Project JDK is not defined"
        => cách fix: phải download jdk tương ứng về máy hoặc version jdk trong máy phải lớn hơn jdk của project
        3. Nên thường xuyên update mới nhất intellij
        4. Tăng kích cỡ:
        File > Settings > Appearance: chỉnh kích cỡ cho cả Intellij
        File > Settings > Editor > Font: chỉnh font của Editor
        File > Settings > Editor > General: chỉnh Mouse over để zoom in/out nhanh font size cho editor
        5. Add theme/icon thông qua plugin + Unistall plugins:
        - Add theme/icon: Settings > Appearance > Theme > Get more theme then search icon
        - Unistall plugin: Disable > Apply > Unistall plugin
        - Custom lại color của theme: File > Settings > Editor > Color Sheme > Language defaults: custom lại theme hiện tại đang dùng
        6. Lưu lại cài đặt font size, color, ... để sau này dùng cho máy khác hoặc khi máy hiện tại bị reset
        File > Manage IDE Settings > Export Settings/Import Settings
        7. Clear cache IDE
        Có một số lỗi mà clear cache có thể fix được lỗi
        File > Invalidate Caches > Check 4 checkbox > Click Invalidate cache and Restart
        => nó clear cache; tháo JDK ra khỏi project; rồi cài lại IDK
        Giao diện hết lỗi nhưng mà chạy code thì bị lỗi
        IDE có dùng cache để build class nhanh; dù có thể chạy nhanh nhưng có thể lưu lại lỗi cũ
        8. Làm sao biết được class nào lỗi
        Bấm vào Build > Rebuild; để rà soát lại lỗi ở vị trí nào
        9. Khi project mất file iml; làm sao mở project lên lại được?
        => Tắt IDE; nên xóa hết các file; chỉ để lại src thôi; thì khi mở lại source thì sẽ tự sinh ra .idea, out, .iml
        Khi gửi source code chỉ cần zip file src; khi mở máy người khác tự gen ra out, .idea, .iml
        10. Recent projects
        */
}
