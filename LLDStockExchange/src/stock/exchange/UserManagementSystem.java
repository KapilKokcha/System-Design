package stock.exchange;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserManagementSystem {
    private static final Map<Long, UserInfo> userMap = new ConcurrentHashMap<>();

    public static UserInfo getUserInfo(long id) {
        return userMap.get(id);
    }

    public static void addUser(UserInfo userInfo) {
        userMap.put(userInfo.getUser().getId(), userInfo);
    }
}