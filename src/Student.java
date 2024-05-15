class Student {
    private ResourceManager resourceManager;

    public Student(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }

    public void borrowResource(String resourceType, String title) {
        Resource resource = resourceManager.createResource(resourceType);
        if (resource != null) {
            resource.borrow(title);
        } else {
            System.out.println("Invalid resource type: " + resourceType);
        }
    }

    public void returnResource(String resourceType, String title) {
        Resource resource = resourceManager.createResource(resourceType);
        if (resource != null) {
            resource.returnResource(title);
        } else {
            System.out.println("Invalid resource type: " + resourceType);
        }
    }
}
