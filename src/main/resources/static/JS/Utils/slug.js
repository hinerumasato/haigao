function getSlug(name) {
    return String(name).replaceAll(" ", "-");
}

export { getSlug };