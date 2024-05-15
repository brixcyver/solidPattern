class ResourceManager {
    public static Resource createResource(String resourceType) {
        if (resourceType.equalsIgnoreCase("book")) {
            return new Book();
        } else if (resourceType.equalsIgnoreCase("journal")) {
            return new Journal();
        }
        return null;
    }
}